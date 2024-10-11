package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.SkipUpLine: ImageVector
    get() {
        if (_skipUpLine != null) {
            return _skipUpLine!!
        }
        _skipUpLine = Builder(name = "SkipUpLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.914f)
                lineTo(16.793f, 18.707f)
                lineTo(18.207f, 17.293f)
                lineTo(12.0f, 11.086f)
                lineTo(5.793f, 17.293f)
                lineTo(7.207f, 18.707f)
                lineTo(12.0f, 13.914f)
                close()
                moveTo(6.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                close()
            }
        }
        .build()
        return _skipUpLine!!
    }

private var _skipUpLine: ImageVector? = null
