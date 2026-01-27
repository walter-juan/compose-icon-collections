package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.HeadphonesSimple: ImageVector
    get() {
        if (_headphonesSimple != null) {
            return _headphonesSimple!!
        }
        _headphonesSimple = Builder(name = "HeadphonesSimple", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 224.0f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                reflectiveCurveToRelative(160.0f, 71.6f, 160.0f, 160.0f)
                lineToRelative(0.0f, 37.5f)
                curveToRelative(-10.0f, -3.5f, -20.8f, -5.5f, -32.0f, -5.5f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -160.0f)
                curveTo(448.0f, 100.3f, 347.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(0.0f, 100.3f, 0.0f, 224.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-11.2f, 0.0f, -22.0f, 1.9f, -32.0f, 5.5f)
                lineTo(64.0f, 224.0f)
                close()
            }
        }
        .build()
        return _headphonesSimple!!
    }

private var _headphonesSimple: ImageVector? = null
