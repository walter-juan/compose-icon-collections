package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCapsule: ImageVector
    get() {
        if (_bxCapsule != null) {
            return _bxCapsule!!
        }
        _bxCapsule = Builder(name = "BxCapsule", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.999f, 20.133f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, false, 3.536f, -1.465f)
                lineToRelative(7.134f, -7.133f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, -0.001f, -7.072f)
                curveTo(18.723f, 3.52f, 17.467f, 3.0f, 16.132f, 3.0f)
                reflectiveCurveToRelative(-2.591f, 0.52f, -3.534f, 1.464f)
                lineToRelative(-7.134f, 7.134f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, 0.0f, 7.072f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, 3.535f, 1.463f)
                close()
                moveTo(14.012f, 5.878f)
                arcTo(2.979f, 2.979f, 0.0f, false, true, 16.132f, 5.0f)
                curveToRelative(0.802f, 0.0f, 1.556f, 0.313f, 2.122f, 0.878f)
                arcToRelative(3.004f, 3.004f, 0.0f, false, true, 0.001f, 4.243f)
                lineToRelative(-2.893f, 2.892f)
                lineTo(11.12f, 8.77f)
                lineToRelative(2.892f, -2.892f)
                close()
                moveTo(6.878f, 13.012f)
                lineTo(9.706f, 10.184f)
                lineTo(13.948f, 14.427f)
                lineTo(11.121f, 17.254f)
                curveToRelative(-1.133f, 1.133f, -3.11f, 1.132f, -4.243f, 0.001f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, -4.243f)
                close()
            }
        }
        .build()
        return _bxCapsule!!
    }

private var _bxCapsule: ImageVector? = null
