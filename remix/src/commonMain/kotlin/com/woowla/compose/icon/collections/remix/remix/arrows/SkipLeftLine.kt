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

public val ArrowsGroup.SkipLeftLine: ImageVector
    get() {
        if (_skipLeftLine != null) {
            return _skipLeftLine!!
        }
        _skipLeftLine = Builder(name = "SkipLeftLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.914f, 12.0f)
                lineTo(18.707f, 7.207f)
                lineTo(17.293f, 5.793f)
                lineTo(11.086f, 12.0f)
                lineTo(17.293f, 18.207f)
                lineTo(18.707f, 16.793f)
                lineTo(13.914f, 12.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _skipLeftLine!!
    }

private var _skipLeftLine: ImageVector? = null
