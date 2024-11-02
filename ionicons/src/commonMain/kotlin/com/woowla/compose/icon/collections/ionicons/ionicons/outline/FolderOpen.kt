package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 192.0f)
                verticalLineTo(120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineToRelative(75.89f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 22.19f, 6.72f)
                lineToRelative(27.84f, 18.56f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 252.11f, 112.0f)
                horizontalLineTo(408.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                verticalLineToRelative(40.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(479.9f, 226.55f)
                lineTo(463.68f, 392.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -39.93f, 40.0f)
                horizontalLineTo(88.25f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -39.93f, -40.0f)
                lineTo(32.1f, 226.55f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 192.0f)
                horizontalLineToRelative(384.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 479.9f, 226.55f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
