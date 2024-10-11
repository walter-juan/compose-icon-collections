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

public val ArrowsGroup.SkipRightLine: ImageVector
    get() {
        if (_skipRightLine != null) {
            return _skipRightLine!!
        }
        _skipRightLine = Builder(name = "SkipRightLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.086f, 12.0f)
                lineTo(5.293f, 16.793f)
                lineTo(6.707f, 18.207f)
                lineTo(12.914f, 12.0f)
                lineTo(6.707f, 5.793f)
                lineTo(5.293f, 7.207f)
                lineTo(10.086f, 12.0f)
                close()
                moveTo(17.0f, 6.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineTo(15.0f)
                lineTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                close()
            }
        }
        .build()
        return _skipRightLine!!
    }

private var _skipRightLine: ImageVector? = null
