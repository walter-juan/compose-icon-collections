package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.FolderCloudLine: ImageVector
    get() {
        if (_folderCloudLine != null) {
            return _folderCloudLine!!
        }
        _folderCloudLine = Builder(name = "FolderCloudLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.586f)
                lineTo(11.586f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.448f, 21.552f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(12.414f)
                lineTo(10.414f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(12.0f, 18.25f)
                curveTo(12.0f, 16.991f, 12.847f, 15.929f, 14.002f, 15.603f)
                curveTo(13.945f, 13.658f, 15.552f, 12.0f, 17.5f, 12.0f)
                curveTo(19.448f, 12.0f, 21.055f, 13.658f, 20.999f, 15.603f)
                curveTo(22.153f, 15.929f, 23.0f, 16.991f, 23.0f, 18.25f)
                curveTo(23.0f, 19.769f, 21.769f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(14.75f)
                curveTo(13.231f, 21.0f, 12.0f, 19.769f, 12.0f, 18.25f)
                close()
                moveTo(17.5f, 14.0f)
                curveTo(16.672f, 14.0f, 16.0f, 14.672f, 16.0f, 15.5f)
                curveTo(16.0f, 15.964f, 16.024f, 16.475f, 16.057f, 16.961f)
                curveTo(15.093f, 17.165f, 14.0f, 17.552f, 14.0f, 18.25f)
                curveTo(14.0f, 18.664f, 14.336f, 19.0f, 14.75f, 19.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 19.0f, 21.0f, 18.664f, 21.0f, 18.25f)
                curveTo(21.0f, 17.552f, 19.907f, 17.165f, 18.943f, 16.961f)
                curveTo(18.976f, 16.475f, 19.0f, 15.964f, 19.0f, 15.5f)
                curveTo(19.0f, 14.672f, 18.328f, 14.0f, 17.5f, 14.0f)
                close()
            }
        }
        .build()
        return _folderCloudLine!!
    }

private var _folderCloudLine: ImageVector? = null
