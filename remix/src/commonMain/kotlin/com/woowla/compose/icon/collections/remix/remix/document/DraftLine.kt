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

public val DocumentGroup.DraftLine: ImageVector
    get() {
        if (_draftLine != null) {
            return _draftLine!!
        }
        _draftLine = Builder(name = "DraftLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(6.757f)
                lineTo(19.0f, 8.757f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.242f)
                lineTo(21.0f, 15.242f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(21.778f, 8.808f)
                lineTo(23.192f, 10.222f)
                lineTo(15.414f, 18.0f)
                lineTo(13.998f, 17.998f)
                lineTo(14.0f, 16.586f)
                lineTo(21.778f, 8.808f)
                close()
                moveTo(13.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _draftLine!!
    }

private var _draftLine: ImageVector? = null