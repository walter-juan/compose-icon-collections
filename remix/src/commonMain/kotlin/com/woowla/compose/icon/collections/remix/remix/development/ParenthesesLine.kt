package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.ParenthesesLine: ImageVector
    get() {
        if (_parenthesesLine != null) {
            return _parenthesesLine!!
        }
        _parenthesesLine = Builder(name = "ParenthesesLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.923f, 21.0f)
                curveTo(5.113f, 18.664f, 4.0f, 15.493f, 4.0f, 12.0f)
                curveTo(4.0f, 8.507f, 5.113f, 5.336f, 6.923f, 3.0f)
                horizontalLineTo(8.937f)
                curveTo(7.235f, 5.388f, 6.2f, 8.542f, 6.2f, 12.0f)
                curveTo(6.2f, 15.458f, 7.235f, 18.612f, 8.937f, 21.0f)
                horizontalLineTo(6.923f)
                close()
                moveTo(17.074f, 21.0f)
                horizontalLineTo(15.06f)
                curveTo(16.762f, 18.612f, 17.797f, 15.458f, 17.797f, 12.0f)
                curveTo(17.797f, 8.542f, 16.762f, 5.388f, 15.06f, 3.0f)
                horizontalLineTo(17.074f)
                curveTo(18.885f, 5.336f, 19.997f, 8.507f, 19.997f, 12.0f)
                curveTo(19.997f, 15.493f, 18.885f, 18.664f, 17.074f, 21.0f)
                close()
            }
        }
        .build()
        return _parenthesesLine!!
    }

private var _parenthesesLine: ImageVector? = null
