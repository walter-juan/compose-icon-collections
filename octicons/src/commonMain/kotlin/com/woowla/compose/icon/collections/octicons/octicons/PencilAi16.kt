package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.PencilAi16: ImageVector
    get() {
        if (_pencilAi16 != null) {
            return _pencilAi16!!
        }
        _pencilAi16 = Builder(name = "PencilAi16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.013f, 1.427f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.474f, 0.0f)
                lineToRelative(1.086f, 1.086f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 0.0f, 2.474f)
                lineToRelative(-8.609f, 8.61f)
                curveToRelative(-0.21f, 0.21f, -0.471f, 0.363f, -0.757f, 0.445f)
                lineToRelative(-3.251f, 0.929f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.736f, -0.191f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.191f, -0.736f)
                lineToRelative(0.929f, -3.251f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 0.445f, -0.757f)
                close()
                moveTo(3.464f, 11.097f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.064f, 0.108f)
                lineToRelative(-0.558f, 1.953f)
                lineToRelative(1.953f, -0.558f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.108f, -0.064f)
                lineToRelative(6.286f, -6.286f)
                lineTo(9.75f, 4.811f)
                close()
                moveTo(12.427f, 2.487f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.354f, 0.0f)
                lineTo(10.811f, 3.75f)
                lineToRelative(1.439f, 1.44f)
                lineToRelative(1.263f, -1.263f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, 0.0f, -0.354f)
                close()
                moveTo(12.269f, 9.163f)
                arcTo(0.246f, 0.246f, 0.0f, false, true, 12.502f, 9.0f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, true, 0.232f, 0.163f)
                lineToRelative(0.238f, 0.648f)
                arcToRelative(3.724f, 3.724f, 0.0f, false, false, 2.219f, 2.219f)
                lineToRelative(0.649f, 0.238f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, 0.16f, 0.202f)
                verticalLineToRelative(0.063f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.16f, 0.202f)
                lineToRelative(-0.649f, 0.238f)
                arcToRelative(3.721f, 3.721f, 0.0f, false, false, -2.219f, 2.218f)
                lineToRelative(-0.238f, 0.649f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, true, -0.193f, 0.16f)
                horizontalLineToRelative(-0.079f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, true, -0.193f, -0.16f)
                lineToRelative(-0.239f, -0.649f)
                arcToRelative(3.737f, 3.737f, 0.0f, false, false, -2.218f, -2.218f)
                lineToRelative(-0.649f, -0.238f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.118f, -0.376f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.118f, -0.091f)
                lineToRelative(0.649f, -0.238f)
                arcToRelative(3.724f, 3.724f, 0.0f, false, false, 2.218f, -2.219f)
                close()
            }
        }
        .build()
        return _pencilAi16!!
    }

private var _pencilAi16: ImageVector? = null
