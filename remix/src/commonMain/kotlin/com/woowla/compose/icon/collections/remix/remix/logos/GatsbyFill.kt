package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GatsbyFill: ImageVector
    get() {
        if (_gatsbyFill != null) {
            return _gatsbyFill!!
        }
        _gatsbyFill = Builder(name = "GatsbyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(6.501f, 2.0f, 2.001f, 6.5f, 2.001f, 12.0f)
                curveTo(2.001f, 17.5f, 6.501f, 22.0f, 12.001f, 22.0f)
                curveTo(17.501f, 22.0f, 22.001f, 17.5f, 22.001f, 12.0f)
                curveTo(22.001f, 6.5f, 17.501f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(6.43f, 17.571f)
                curveTo(4.93f, 16.071f, 4.144f, 14.071f, 4.144f, 12.143f)
                lineTo(11.93f, 19.857f)
                curveTo(9.93f, 19.786f, 7.93f, 19.071f, 6.43f, 17.571f)
                close()
                moveTo(13.715f, 19.643f)
                lineTo(4.358f, 10.286f)
                curveTo(5.144f, 6.786f, 8.287f, 4.143f, 12.001f, 4.143f)
                curveTo(14.644f, 4.143f, 16.93f, 5.429f, 18.358f, 7.357f)
                lineTo(17.287f, 8.286f)
                curveTo(16.072f, 6.643f, 14.144f, 5.571f, 12.001f, 5.571f)
                curveTo(9.215f, 5.571f, 6.858f, 7.357f, 5.93f, 9.857f)
                lineTo(14.144f, 18.071f)
                curveTo(16.215f, 17.357f, 17.787f, 15.571f, 18.287f, 13.429f)
                horizontalLineTo(14.858f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.858f)
                curveTo(19.858f, 15.714f, 17.215f, 18.857f, 13.715f, 19.643f)
                close()
            }
        }
        .build()
        return _gatsbyFill!!
    }

private var _gatsbyFill: ImageVector? = null
