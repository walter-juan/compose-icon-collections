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

public val RegularGroup.BxWrench: ImageVector
    get() {
        if (_bxWrench != null) {
            return _bxWrench!!
        }
        _bxWrench = Builder(name = "BxWrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.122f, 21.0f)
                curveToRelative(0.378f, 0.378f, 0.88f, 0.586f, 1.414f, 0.586f)
                reflectiveCurveTo(7.572f, 21.378f, 7.95f, 21.0f)
                lineToRelative(4.336f, -4.336f)
                arcToRelative(7.495f, 7.495f, 0.0f, false, false, 2.217f, 0.333f)
                arcToRelative(7.446f, 7.446f, 0.0f, false, false, 5.302f, -2.195f)
                arcToRelative(7.484f, 7.484f, 0.0f, false, false, 1.632f, -8.158f)
                lineToRelative(-0.57f, -1.388f)
                lineToRelative(-4.244f, 4.243f)
                lineToRelative(-2.121f, -2.122f)
                lineToRelative(4.243f, -4.243f)
                lineToRelative(-1.389f, -0.571f)
                arcTo(7.478f, 7.478f, 0.0f, false, false, 14.499f, 2.0f)
                curveToRelative(-2.003f, 0.0f, -3.886f, 0.78f, -5.301f, 2.196f)
                arcToRelative(7.479f, 7.479f, 0.0f, false, false, -1.862f, 7.518f)
                lineTo(3.0f, 16.05f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, false, 0.0f, 2.828f)
                lineTo(5.122f, 21.0f)
                close()
                moveTo(9.67f, 12.209f)
                lineTo(9.416f, 11.593f)
                arcToRelative(5.486f, 5.486f, 0.0f, false, true, 1.196f, -5.983f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, true, 4.413f, -1.585f)
                lineToRelative(-3.353f, 3.353f)
                lineToRelative(4.949f, 4.95f)
                lineToRelative(3.355f, -3.355f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, true, -1.587f, 4.416f)
                curveToRelative(-1.55f, 1.55f, -3.964f, 2.027f, -5.984f, 1.196f)
                lineToRelative(-0.615f, -0.255f)
                lineToRelative(-5.254f, 5.256f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.001f, 1.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(5.256f, -5.255f)
                close()
            }
        }
        .build()
        return _bxWrench!!
    }

private var _bxWrench: ImageVector? = null
