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

public val DocumentGroup.FolderForbidFill: ImageVector
    get() {
        if (_folderForbidFill != null) {
            return _folderForbidFill!!
        }
        _folderForbidFill = Builder(name = "FolderForbidFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.255f)
                curveTo(20.866f, 10.464f, 19.487f, 10.0f, 18.0f, 10.0f)
                curveTo(14.134f, 10.0f, 11.0f, 13.134f, 11.0f, 17.0f)
                curveTo(11.0f, 18.487f, 11.464f, 19.866f, 12.255f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                lineTo(12.414f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(11.255f)
                close()
                moveTo(18.0f, 22.0f)
                curveTo(15.239f, 22.0f, 13.0f, 19.761f, 13.0f, 17.0f)
                curveTo(13.0f, 14.239f, 15.239f, 12.0f, 18.0f, 12.0f)
                curveTo(20.761f, 12.0f, 23.0f, 14.239f, 23.0f, 17.0f)
                curveTo(23.0f, 19.761f, 20.761f, 22.0f, 18.0f, 22.0f)
                close()
                moveTo(16.707f, 19.708f)
                curveTo(17.098f, 19.895f, 17.537f, 20.0f, 18.0f, 20.0f)
                curveTo(19.657f, 20.0f, 21.0f, 18.657f, 21.0f, 17.0f)
                curveTo(21.0f, 16.537f, 20.895f, 16.098f, 20.708f, 15.707f)
                lineTo(16.707f, 19.708f)
                close()
                moveTo(15.292f, 18.293f)
                lineTo(19.293f, 14.292f)
                curveTo(18.902f, 14.105f, 18.463f, 14.0f, 18.0f, 14.0f)
                curveTo(16.343f, 14.0f, 15.0f, 15.343f, 15.0f, 17.0f)
                curveTo(15.0f, 17.463f, 15.105f, 17.902f, 15.292f, 18.293f)
                close()
            }
        }
        .build()
        return _folderForbidFill!!
    }

private var _folderForbidFill: ImageVector? = null
