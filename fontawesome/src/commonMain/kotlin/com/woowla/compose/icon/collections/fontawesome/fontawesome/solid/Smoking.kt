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

public val SolidGroup.Smoking: ImageVector
    get() {
        if (_smoking != null) {
            return _smoking!!
        }
        _smoking = Builder(name = "Smoking", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 19.0f)
                curveToRelative(0.0f, 40.3f, 16.0f, 79.0f, 44.5f, 107.5f)
                lineToRelative(21.0f, 21.0f)
                curveTo(469.0f, 191.0f, 480.0f, 217.4f, 480.0f, 245.0f)
                lineToRelative(0.0f, 19.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -19.0f)
                curveToRelative(0.0f, -14.9f, -5.9f, -29.1f, -16.4f, -39.6f)
                lineToRelative(-21.0f, -21.0f)
                curveTo(357.1f, 146.9f, 336.0f, 96.0f, 336.0f, 43.0f)
                lineToRelative(0.0f, -19.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(552.0f, 288.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -19.0f)
                curveToRelative(0.0f, -40.3f, -16.0f, -79.0f, -44.5f, -107.5f)
                lineToRelative(-21.0f, -21.0f)
                curveTo(443.0f, 97.0f, 432.0f, 70.6f, 432.0f, 43.0f)
                lineToRelative(0.0f, -19.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 19.0f)
                curveToRelative(0.0f, 14.9f, 5.9f, 29.1f, 16.4f, 39.6f)
                lineToRelative(21.0f, 21.0f)
                curveTo(554.9f, 141.1f, 576.0f, 192.0f, 576.0f, 245.0f)
                lineToRelative(0.0f, 19.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(320.0f, 448.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                close()
                moveTo(0.0f, 416.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(576.0f, 376.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -112.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _smoking!!
    }

private var _smoking: ImageVector? = null
