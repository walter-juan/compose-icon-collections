package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.PresentationFill: ImageVector
    get() {
        if (_presentationFill != null) {
            return _presentationFill!!
        }
        _presentationFill = Builder(name = "PresentationFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 5.105f, 7.105f, 6.0f, 6.0f, 6.0f)
                curveTo(4.895f, 6.0f, 4.0f, 5.105f, 4.0f, 4.0f)
                curveTo(4.0f, 2.895f, 4.895f, 2.0f, 6.0f, 2.0f)
                curveTo(7.105f, 2.0f, 8.0f, 2.895f, 8.0f, 4.0f)
                close()
                moveTo(5.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 8.343f, 4.343f, 7.0f, 6.0f, 7.0f)
                curveTo(6.821f, 7.0f, 7.564f, 7.329f, 8.106f, 7.863f)
                lineTo(10.48f, 10.106f)
                lineTo(12.793f, 7.793f)
                lineTo(14.207f, 9.207f)
                lineTo(10.52f, 12.894f)
                lineTo(9.0f, 11.459f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.365f)
                lineTo(17.189f, 22.0f)
                horizontalLineTo(19.399f)
                lineTo(16.576f, 16.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 16.0f, 21.0f, 15.552f, 21.0f, 15.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _presentationFill!!
    }

private var _presentationFill: ImageVector? = null
