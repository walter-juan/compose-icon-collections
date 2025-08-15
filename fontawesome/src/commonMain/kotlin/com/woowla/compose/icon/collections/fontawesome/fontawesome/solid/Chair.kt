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

public val SolidGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(name = "Chair", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 256.0f)
                lineToRelative(0.0f, -181.8f)
                curveToRelative(-24.5f, 20.5f, -40.0f, 51.4f, -40.0f, 85.8f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(40.0f, 0.0f)
                close()
                moveTo(200.0f, 256.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -205.4f)
                curveToRelative(-7.7f, -1.7f, -15.8f, -2.6f, -24.0f, -2.6f)
                reflectiveCurveToRelative(-16.3f, 0.9f, -24.0f, 2.6f)
                lineTo(200.0f, 256.0f)
                close()
                moveTo(296.0f, 74.2f)
                lineToRelative(0.0f, 181.8f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -34.4f, -15.5f, -65.2f, -40.0f, -85.8f)
                close()
                moveTo(32.0f, 256.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveTo(64.0f, 71.6f, 135.6f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(384.0f, 71.6f, 384.0f, 160.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-256.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
