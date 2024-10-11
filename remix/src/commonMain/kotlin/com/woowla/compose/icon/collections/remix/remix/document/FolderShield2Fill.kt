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

public val DocumentGroup.FolderShield2Fill: ImageVector
    get() {
        if (_folderShield2Fill != null) {
            return _folderShield2Fill!!
        }
        _folderShield2Fill = Builder(name = "FolderShield2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.382f)
                curveTo(12.0f, 18.791f, 12.632f, 20.116f, 13.705f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                lineTo(12.414f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.382f)
                curveTo(22.0f, 18.279f, 21.554f, 19.116f, 20.813f, 19.613f)
                lineTo(18.0f, 21.498f)
                lineTo(15.188f, 19.613f)
                curveTo(14.446f, 19.116f, 14.0f, 18.279f, 14.0f, 17.382f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _folderShield2Fill!!
    }

private var _folderShield2Fill: ImageVector? = null
