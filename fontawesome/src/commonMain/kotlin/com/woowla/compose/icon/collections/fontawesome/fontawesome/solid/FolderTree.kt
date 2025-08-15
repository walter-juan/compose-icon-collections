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

public val SolidGroup.FolderTree: ImageVector
    get() {
        if (_folderTree != null) {
            return _folderTree!!
        }
        _folderTree = Builder(name = "FolderTree", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 24.0f)
                curveTo(48.0f, 10.7f, 37.3f, 0.0f, 24.0f, 0.0f)
                reflectiveCurveTo(0.0f, 10.7f, 0.0f, 24.0f)
                lineTo(0.0f, 392.0f)
                curveToRelative(0.0f, 30.9f, 25.1f, 56.0f, 56.0f, 56.0f)
                lineToRelative(184.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-184.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                lineToRelative(0.0f, -232.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -88.0f)
                close()
                moveTo(336.0f, 224.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-82.7f, 0.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, -3.4f, -22.6f, -9.4f)
                lineToRelative(-8.6f, -8.6f)
                curveToRelative(-9.0f, -9.0f, -21.2f, -14.1f, -33.9f, -14.1f)
                lineTo(336.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(336.0f, 512.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-82.7f, 0.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, -3.4f, -22.6f, -9.4f)
                lineToRelative(-8.6f, -8.6f)
                curveToRelative(-9.0f, -9.0f, -21.2f, -14.1f, -33.9f, -14.1f)
                lineTo(336.0f, 288.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _folderTree!!
    }

private var _folderTree: ImageVector? = null
