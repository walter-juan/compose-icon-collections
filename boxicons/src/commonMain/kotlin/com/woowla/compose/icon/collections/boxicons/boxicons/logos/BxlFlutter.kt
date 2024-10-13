package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlFlutter: ImageVector
    get() {
        if (_bxlFlutter != null) {
            return _bxlFlutter!!
        }
        _bxlFlutter = Builder(name = "BxlFlutter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9f, 2.01f)
                lineTo(3.9f, 12.0f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(2.71f, -2.7f)
                lineTo(20.09f, 2.0f)
                lineToRelative(-6.19f, 0.01f)
                close()
                moveTo(14.72f, 16.61f)
                lineTo(20.11f, 11.23f)
                horizontalLineToRelative(-5.93f)
                curveToRelative(-0.11f, 0.0f, -0.26f, 0.0f, -0.34f, 0.07f)
                lineToRelative(-2.23f, 2.23f)
                lineToRelative(-3.09f, 3.07f)
                lineToRelative(3.09f, 3.1f)
                lineToRelative(2.15f, 2.15f)
                curveToRelative(0.07f, 0.07f, 0.14f, 0.17f, 0.26f, 0.15f)
                horizontalLineToRelative(6.07f)
                close()
            }
        }
        .build()
        return _bxlFlutter!!
    }

private var _bxlFlutter: ImageVector? = null
