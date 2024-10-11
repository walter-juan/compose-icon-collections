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

public val EditorGroup.SortAlphabetDesc: ImageVector
    get() {
        if (_sortAlphabetDesc != null) {
            return _sortAlphabetDesc!!
        }
        _sortAlphabetDesc = Builder(name = "SortAlphabetDesc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.869f, 11.0f)
                horizontalLineTo(2.667f)
                lineTo(6.0f, 3.0f)
                horizontalLineTo(8.0f)
                lineTo(11.333f, 11.0f)
                horizontalLineTo(9.131f)
                lineTo(8.721f, 10.0f)
                horizontalLineTo(5.279f)
                lineTo(4.869f, 11.0f)
                close()
                moveTo(6.098f, 8.0f)
                horizontalLineTo(7.902f)
                lineTo(7.0f, 5.8f)
                lineTo(6.098f, 8.0f)
                close()
                moveTo(22.0f, 8.0f)
                lineTo(18.0f, 3.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.854f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.146f)
                lineTo(11.0f, 15.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _sortAlphabetDesc!!
    }

private var _sortAlphabetDesc: ImageVector? = null
