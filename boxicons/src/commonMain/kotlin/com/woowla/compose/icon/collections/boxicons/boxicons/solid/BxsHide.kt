package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsHide: ImageVector
    get() {
        if (_bxsHide != null) {
            return _bxsHide!!
        }
        _bxsHide = Builder(name = "BxsHide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.073f, 12.194f)
                lineTo(4.212f, 8.333f)
                curveToRelative(-1.52f, 1.657f, -2.096f, 3.317f, -2.106f, 3.351f)
                lineTo(2.0f, 12.0f)
                lineToRelative(0.105f, 0.316f)
                curveTo(2.127f, 12.383f, 4.421f, 19.0f, 12.054f, 19.0f)
                curveToRelative(0.929f, 0.0f, 1.775f, -0.102f, 2.552f, -0.273f)
                lineToRelative(-2.746f, -2.746f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, true, -3.787f, -3.787f)
                close()
                moveTo(12.054f, 5.0f)
                curveToRelative(-1.855f, 0.0f, -3.375f, 0.404f, -4.642f, 0.998f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.298f, -3.298f)
                curveToRelative(2.638f, -1.953f, 3.579f, -4.637f, 3.593f, -4.679f)
                lineToRelative(0.105f, -0.316f)
                lineToRelative(-0.105f, -0.316f)
                curveTo(21.98f, 11.617f, 19.687f, 5.0f, 12.054f, 5.0f)
                close()
                moveTo(13.96f, 12.546f)
                curveToRelative(0.187f, -0.677f, 0.028f, -1.439f, -0.492f, -1.96f)
                reflectiveCurveToRelative(-1.283f, -0.679f, -1.96f, -0.492f)
                lineTo(10.0f, 8.586f)
                arcTo(3.955f, 3.955f, 0.0f, false, true, 12.054f, 8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -0.587f, 2.053f)
                lineToRelative(-1.507f, -1.507f)
                close()
            }
        }
        .build()
        return _bxsHide!!
    }

private var _bxsHide: ImageVector? = null
