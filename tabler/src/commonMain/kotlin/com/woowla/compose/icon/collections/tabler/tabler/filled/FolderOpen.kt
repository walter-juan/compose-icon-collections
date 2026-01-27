package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveToRelative(0.0f, -0.796f, 0.316f, -1.558f, 0.879f, -2.121f)
                curveToRelative(0.563f, -0.563f, 1.325f, -0.879f, 2.121f, -0.879f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.099f, 0.005f)
                curveToRelative(0.229f, 0.023f, 0.444f, 0.124f, 0.608f, 0.288f)
                lineToRelative(2.707f, 2.707f)
                horizontalLineToRelative(6.586f)
                curveToRelative(0.796f, 0.0f, 1.558f, 0.316f, 2.121f, 0.879f)
                curveToRelative(0.319f, 0.319f, 0.559f, 0.703f, 0.707f, 1.121f)
                lineToRelative(-14.523f, 0.0f)
                curveToRelative(-0.407f, 0.0f, -0.805f, 0.125f, -1.14f, 0.356f)
                curveToRelative(-0.292f, 0.203f, -0.525f, 0.48f, -0.674f, 0.801f)
                lineToRelative(-0.058f, 0.141f)
                lineToRelative(-1.379f, 3.676f)
                curveToRelative(-0.194f, 0.517f, 0.068f, 1.093f, 0.585f, 1.287f)
                curveToRelative(0.517f, 0.194f, 1.094f, -0.068f, 1.288f, -0.585f)
                lineToRelative(1.134f, -3.027f)
                curveToRelative(0.146f, -0.39f, 0.519f, -0.649f, 0.937f, -0.649f)
                horizontalLineToRelative(13.002f)
                lineToRelative(0.217f, 0.012f)
                curveToRelative(0.216f, 0.024f, 0.426f, 0.082f, 0.624f, 0.173f)
                curveToRelative(0.054f, 0.025f, 0.107f, 0.053f, 0.159f, 0.083f)
                curveToRelative(0.199f, 0.115f, 0.377f, 0.263f, 0.525f, 0.439f)
                curveToRelative(0.188f, 0.222f, 0.325f, 0.482f, 0.403f, 0.762f)
                curveToRelative(0.077f, 0.28f, 0.092f, 0.573f, 0.045f, 0.859f)
                curveToRelative(-0.001f, 0.008f, -0.003f, 0.016f, -0.005f, 0.024f)
                lineToRelative(-0.995f, 5.21f)
                curveToRelative(-0.131f, 0.686f, -0.497f, 1.304f, -1.036f, 1.749f)
                curveToRelative(-0.47f, 0.389f, -1.046f, 0.624f, -1.65f, 0.677f)
                lineToRelative(-0.261f, 0.012f)
                horizontalLineToRelative(-14.026f)
                curveToRelative(-0.796f, 0.0f, -1.558f, -0.316f, -2.121f, -0.879f)
                curveToRelative(-0.563f, -0.563f, -0.879f, -1.325f, -0.879f, -2.121f)
                verticalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
