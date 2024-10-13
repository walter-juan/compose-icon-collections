package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsSpa: ImageVector
    get() {
        if (_bxsSpa != null) {
            return _bxsSpa!!
        }
        _bxsSpa = Builder(name = "BxsSpa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.114f)
                curveToRelative(-3.998f, -5.951f, -8.574f, -7.043f, -8.78f, -7.09f)
                lineTo(2.0f, 8.75f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, 7.29f, 3.925f, 12.0f, 10.0f, 12.0f)
                curveToRelative(5.981f, 0.0f, 10.0f, -4.822f, 10.0f, -12.0f)
                verticalLineTo(8.75f)
                lineToRelative(-1.22f, 0.274f)
                curveToRelative(-0.206f, 0.047f, -4.782f, 1.139f, -8.78f, 7.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.274f, 3.767f)
                curveToRelative(-1.799f, 1.898f, -2.84f, 3.775f, -3.443f, 5.295f)
                curveToRelative(1.329f, 0.784f, 2.781f, 1.943f, 4.159f, 3.685f)
                curveToRelative(1.364f, -1.76f, 2.826f, -2.925f, 4.17f, -3.709f)
                curveToRelative(-0.605f, -1.515f, -1.646f, -3.383f, -3.435f, -5.271f)
                lineTo(12.0f, 3.0f)
                lineToRelative(-0.726f, 0.767f)
                close()
            }
        }
        .build()
        return _bxsSpa!!
    }

private var _bxsSpa: ImageVector? = null
