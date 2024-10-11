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

public val DocumentGroup.FolderCloudFill: ImageVector
    get() {
        if (_folderCloudFill != null) {
            return _folderCloudFill!!
        }
        _folderCloudFill = Builder(name = "FolderCloudFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                lineTo(12.414f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(12.36f)
                curveTo(21.002f, 10.941f, 19.354f, 10.0f, 17.5f, 10.0f)
                curveTo(14.898f, 10.0f, 12.701f, 11.853f, 12.139f, 14.282f)
                curveTo(10.851f, 15.131f, 10.0f, 16.589f, 10.0f, 18.25f)
                curveTo(10.0f, 19.275f, 10.325f, 20.224f, 10.877f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(14.002f, 15.603f)
                curveTo(12.847f, 15.929f, 12.0f, 16.991f, 12.0f, 18.25f)
                curveTo(12.0f, 19.769f, 13.231f, 21.0f, 14.75f, 21.0f)
                horizontalLineTo(20.25f)
                curveTo(21.769f, 21.0f, 23.0f, 19.769f, 23.0f, 18.25f)
                curveTo(23.0f, 16.991f, 22.153f, 15.929f, 20.999f, 15.603f)
                curveTo(21.055f, 13.658f, 19.448f, 12.0f, 17.5f, 12.0f)
                curveTo(15.552f, 12.0f, 13.945f, 13.658f, 14.002f, 15.603f)
                close()
            }
        }
        .build()
        return _folderCloudFill!!
    }

private var _folderCloudFill: ImageVector? = null
