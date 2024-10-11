package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.DropdownList: ImageVector
    get() {
        if (_dropdownList != null) {
            return _dropdownList!!
        }
        _dropdownList = Builder(name = "DropdownList", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(19.707f, 11.293f)
                lineTo(19.0f, 10.586f)
                lineTo(18.293f, 11.293f)
                lineTo(15.293f, 14.293f)
                lineTo(16.707f, 15.707f)
                lineTo(19.0f, 13.414f)
                lineTo(21.293f, 15.707f)
                lineTo(22.707f, 14.293f)
                lineTo(19.707f, 11.293f)
                close()
                moveTo(16.707f, 17.293f)
                lineTo(19.0f, 19.586f)
                lineTo(21.293f, 17.293f)
                lineTo(22.707f, 18.707f)
                lineTo(19.707f, 21.707f)
                lineTo(19.0f, 22.414f)
                lineTo(18.293f, 21.707f)
                lineTo(15.293f, 18.707f)
                lineTo(16.707f, 17.293f)
                close()
            }
        }
        .build()
        return _dropdownList!!
    }

private var _dropdownList: ImageVector? = null
