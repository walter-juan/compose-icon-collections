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

public val DocumentGroup.Folder6Line: ImageVector
    get() {
        if (_folder6Line != null) {
            return _folder6Line!!
        }
        _folder6Line = Builder(name = "Folder6Line", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                curveTo(2.45f, 21.0f, 2.0f, 20.55f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(10.586f, 6.0f)
                lineTo(9.586f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.586f)
                lineTo(10.586f, 6.0f)
                close()
                moveTo(4.0f, 9.0f)
                verticalLineTo(19.0f)
                lineTo(20.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.414f)
                lineTo(10.414f, 9.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _folder6Line!!
    }

private var _folder6Line: ImageVector? = null
