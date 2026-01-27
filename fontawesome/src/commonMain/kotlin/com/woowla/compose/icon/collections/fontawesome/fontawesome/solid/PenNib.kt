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

public val SolidGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.5f, 18.3f)
                lineToRelative(-50.1f, 50.1f)
                lineToRelative(125.3f, 125.3f)
                lineToRelative(50.1f, -50.1f)
                curveToRelative(21.9f, -21.9f, 21.9f, -57.3f, 0.0f, -79.2f)
                lineTo(447.7f, 18.3f)
                curveToRelative(-21.9f, -21.9f, -57.3f, -21.9f, -79.2f, 0.0f)
                close()
                moveTo(279.3f, 97.2f)
                lineToRelative(-0.5f, 0.1f)
                lineToRelative(-144.1f, 43.2f)
                curveToRelative(-19.9f, 6.0f, -35.7f, 21.2f, -42.3f, 41.0f)
                lineTo(3.8f, 445.8f)
                curveToRelative(-2.9f, 8.7f, -1.9f, 18.2f, 2.5f, 26.0f)
                lineTo(161.7f, 316.4f)
                curveToRelative(-1.1f, -4.0f, -1.6f, -8.1f, -1.6f, -12.4f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                curveToRelative(-4.3f, 0.0f, -8.5f, -0.6f, -12.4f, -1.6f)
                lineTo(40.3f, 505.7f)
                curveToRelative(7.8f, 4.4f, 17.2f, 5.4f, 26.0f, 2.5f)
                lineToRelative(264.3f, -88.6f)
                curveToRelative(19.7f, -6.6f, 35.0f, -22.4f, 41.0f, -42.3f)
                lineToRelative(43.2f, -144.1f)
                lineToRelative(0.1f, -0.5f)
                lineToRelative(-135.5f, -135.5f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
