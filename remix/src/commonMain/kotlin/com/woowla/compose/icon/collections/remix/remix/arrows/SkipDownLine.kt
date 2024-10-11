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

public val ArrowsGroup.SkipDownLine: ImageVector
    get() {
        if (_skipDownLine != null) {
            return _skipDownLine!!
        }
        _skipDownLine = Builder(name = "SkipDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.086f)
                lineTo(7.207f, 5.293f)
                lineTo(5.793f, 6.707f)
                lineTo(12.0f, 12.914f)
                lineTo(18.207f, 6.707f)
                lineTo(16.793f, 5.293f)
                lineTo(12.0f, 10.086f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _skipDownLine!!
    }

private var _skipDownLine: ImageVector? = null
