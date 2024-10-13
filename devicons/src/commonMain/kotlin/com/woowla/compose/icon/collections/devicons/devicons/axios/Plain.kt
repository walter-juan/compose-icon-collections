package com.woowla.compose.icon.collections.devicons.devicons.axios

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AxiosGroup

public val AxiosGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF5a29e4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(34.0f, 43.98f)
                lineToRelative(27.38f, -22.91f)
                lineToRelative(0.04f, 91.49f)
                lineToRelative(-9.32f, 7.74f)
                lineToRelative(-0.15f, -76.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5a29e4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.96f, 82.32f)
                lineTo(69.58f, 105.23f)
                lineTo(69.54f, 13.74f)
                lineTo(78.86f, 6.0f)
                lineToRelative(0.15f, 76.09f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
