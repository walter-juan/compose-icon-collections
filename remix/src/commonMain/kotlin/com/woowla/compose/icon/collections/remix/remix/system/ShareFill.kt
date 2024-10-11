package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.ShareFill: ImageVector
    get() {
        if (_shareFill != null) {
            return _shareFill!!
        }
        _shareFill = Builder(name = "ShareFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.576f, 17.271f)
                lineTo(8.466f, 14.484f)
                curveTo(7.833f, 15.112f, 6.962f, 15.5f, 6.0f, 15.5f)
                curveTo(4.067f, 15.5f, 2.5f, 13.933f, 2.5f, 12.0f)
                curveTo(2.5f, 10.067f, 4.067f, 8.5f, 6.0f, 8.5f)
                curveTo(6.962f, 8.5f, 7.833f, 8.888f, 8.466f, 9.516f)
                lineTo(13.576f, 6.729f)
                curveTo(13.526f, 6.494f, 13.5f, 6.25f, 13.5f, 6.0f)
                curveTo(13.5f, 4.067f, 15.067f, 2.5f, 17.0f, 2.5f)
                curveTo(18.933f, 2.5f, 20.5f, 4.067f, 20.5f, 6.0f)
                curveTo(20.5f, 7.933f, 18.933f, 9.5f, 17.0f, 9.5f)
                curveTo(16.038f, 9.5f, 15.167f, 9.112f, 14.534f, 8.484f)
                lineTo(9.424f, 11.271f)
                curveTo(9.474f, 11.506f, 9.5f, 11.75f, 9.5f, 12.0f)
                curveTo(9.5f, 12.25f, 9.474f, 12.493f, 9.424f, 12.729f)
                lineTo(14.534f, 15.516f)
                curveTo(15.167f, 14.888f, 16.038f, 14.5f, 17.0f, 14.5f)
                curveTo(18.933f, 14.5f, 20.5f, 16.067f, 20.5f, 18.0f)
                curveTo(20.5f, 19.933f, 18.933f, 21.5f, 17.0f, 21.5f)
                curveTo(15.067f, 21.5f, 13.5f, 19.933f, 13.5f, 18.0f)
                curveTo(13.5f, 17.75f, 13.526f, 17.506f, 13.576f, 17.271f)
                close()
            }
        }
        .build()
        return _shareFill!!
    }

private var _shareFill: ImageVector? = null
