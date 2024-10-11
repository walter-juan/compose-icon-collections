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

public val EditorGroup.H6: ImageVector
    get() {
        if (_h6 != null) {
            return _h6!!
        }
        _h6 = Builder(name = "H6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.097f, 8.0f)
                lineTo(18.499f, 12.5f)
                curveTo(20.709f, 12.5f, 22.5f, 14.291f, 22.5f, 16.5f)
                curveTo(22.5f, 18.709f, 20.709f, 20.5f, 18.5f, 20.5f)
                curveTo(16.291f, 20.5f, 14.5f, 18.709f, 14.5f, 16.5f)
                curveTo(14.5f, 15.764f, 14.699f, 15.074f, 15.046f, 14.481f)
                lineTo(18.788f, 8.0f)
                horizontalLineTo(21.097f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.5f, 14.5f)
                curveTo(17.395f, 14.5f, 16.5f, 15.395f, 16.5f, 16.5f)
                curveTo(16.5f, 17.605f, 17.395f, 18.5f, 18.5f, 18.5f)
                curveTo(19.605f, 18.5f, 20.5f, 17.605f, 20.5f, 16.5f)
                curveTo(20.5f, 15.395f, 19.605f, 14.5f, 18.5f, 14.5f)
                close()
            }
        }
        .build()
        return _h6!!
    }

private var _h6: ImageVector? = null
