package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.GlobeFill: ImageVector
    get() {
        if (_globeFill != null) {
            return _globeFill!!
        }
        _globeFill = Builder(name = "GlobeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.951f)
                curveTo(7.707f, 19.624f, 4.884f, 17.699f, 3.316f, 14.962f)
                lineTo(5.053f, 13.97f)
                curveTo(6.432f, 16.378f, 9.027f, 18.0f, 12.0f, 18.0f)
                curveTo(16.419f, 18.0f, 20.0f, 14.418f, 20.0f, 10.0f)
                curveTo(20.0f, 7.026f, 18.378f, 4.432f, 15.97f, 3.053f)
                lineTo(16.963f, 1.316f)
                curveTo(19.972f, 3.04f, 22.0f, 6.283f, 22.0f, 10.0f)
                curveTo(22.0f, 15.185f, 18.054f, 19.449f, 13.0f, 19.951f)
                verticalLineTo(21.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(8.134f, 17.0f, 5.0f, 13.866f, 5.0f, 10.0f)
                curveTo(5.0f, 6.134f, 8.134f, 3.0f, 12.0f, 3.0f)
                curveTo(15.866f, 3.0f, 19.0f, 6.134f, 19.0f, 10.0f)
                curveTo(19.0f, 13.866f, 15.866f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _globeFill!!
    }

private var _globeFill: ImageVector? = null
