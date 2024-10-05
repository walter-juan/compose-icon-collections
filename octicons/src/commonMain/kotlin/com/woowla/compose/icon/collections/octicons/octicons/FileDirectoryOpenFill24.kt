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

public val Octicons.FileDirectoryOpenFill24: ImageVector
    get() {
        if (_fileDirectoryOpenFill24 != null) {
            return _fileDirectoryOpenFill24!!
        }
        _fileDirectoryOpenFill24 = Builder(name = "FileDirectoryOpenFill24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 3.784f, 2.784f, 3.0f, 3.75f, 3.0f)
                horizontalLineToRelative(4.971f)
                curveToRelative(0.58f, 0.0f, 1.12f, 0.286f, 1.447f, 0.765f)
                lineToRelative(1.404f, 2.063f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.207f, 0.11f)
                horizontalLineToRelative(6.224f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineToRelative(0.117f)
                horizontalLineTo(5.408f)
                arcToRelative(0.848f, 0.848f, 0.0f, false, false, 0.0f, 1.695f)
                horizontalLineToRelative(15.484f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.995f, 1.102f)
                lineTo(21.0f, 19.25f)
                curveToRelative(-0.106f, 1.05f, -0.784f, 1.75f, -1.75f, 1.75f)
                horizontalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 19.25f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _fileDirectoryOpenFill24!!
    }

private var _fileDirectoryOpenFill24: ImageVector? = null
