package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 224.0f)
                curveToRelative(0.0f, -97.2f, 78.8f, -176.0f, 176.0f, -176.0f)
                reflectiveCurveToRelative(176.0f, 78.8f, 176.0f, 176.0f)
                lineToRelative(0.0f, 44.8f)
                curveToRelative(-14.1f, -8.2f, -30.5f, -12.8f, -48.0f, -12.8f)
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
                curveToRelative(-17.5f, 0.0f, -33.9f, 4.7f, -48.0f, 12.8f)
                lineTo(48.0f, 224.0f)
                close()
                moveTo(48.0f, 352.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(400.0f, 352.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
