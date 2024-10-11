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

public val EditorGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.154f, 14.0f)
                curveTo(17.385f, 14.516f, 17.5f, 15.089f, 17.5f, 15.72f)
                curveTo(17.5f, 17.063f, 16.976f, 18.112f, 15.929f, 18.867f)
                curveTo(14.881f, 19.622f, 13.434f, 20.0f, 11.586f, 20.0f)
                curveTo(9.947f, 20.0f, 8.323f, 19.618f, 6.716f, 18.855f)
                verticalLineTo(16.601f)
                curveTo(8.235f, 17.478f, 9.791f, 17.917f, 11.382f, 17.917f)
                curveTo(13.933f, 17.917f, 15.213f, 17.185f, 15.221f, 15.72f)
                curveTo(15.221f, 15.094f, 15.005f, 14.56f, 14.573f, 14.117f)
                curveTo(14.534f, 14.077f, 14.494f, 14.038f, 14.453f, 14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.154f)
                close()
                moveTo(13.076f, 11.0f)
                horizontalLineTo(7.629f)
                curveTo(7.457f, 10.843f, 7.296f, 10.669f, 7.148f, 10.478f)
                curveTo(6.716f, 9.921f, 6.5f, 9.246f, 6.5f, 8.452f)
                curveTo(6.5f, 7.216f, 6.966f, 6.165f, 7.897f, 5.299f)
                curveTo(8.829f, 4.433f, 10.271f, 4.0f, 12.222f, 4.0f)
                curveTo(13.693f, 4.0f, 15.101f, 4.328f, 16.444f, 4.984f)
                verticalLineTo(7.136f)
                curveTo(15.245f, 6.449f, 13.929f, 6.106f, 12.498f, 6.106f)
                curveTo(10.019f, 6.106f, 8.779f, 6.888f, 8.779f, 8.452f)
                curveTo(8.779f, 8.872f, 8.997f, 9.238f, 9.433f, 9.551f)
                curveTo(9.869f, 9.864f, 10.407f, 10.113f, 11.046f, 10.3f)
                curveTo(11.667f, 10.482f, 12.343f, 10.715f, 13.076f, 11.0f)
                horizontalLineTo(13.076f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
