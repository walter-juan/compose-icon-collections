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

public val SolidGroup.FolderClosed: ImageVector
    get() {
        if (_folderClosed != null) {
            return _folderClosed!!
        }
        _folderClosed = Builder(name = "FolderClosed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 448.0f)
                lineTo(64.0f, 448.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(512.0f, 0.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(512.0f, 160.0f)
                lineTo(0.0f, 160.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(138.7f, 0.0f)
                curveToRelative(13.8f, 0.0f, 27.3f, 4.5f, 38.4f, 12.8f)
                lineToRelative(38.4f, 28.8f)
                curveToRelative(5.5f, 4.2f, 12.3f, 6.4f, 19.2f, 6.4f)
                lineTo(448.0f, 80.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _folderClosed!!
    }

private var _folderClosed: ImageVector? = null
