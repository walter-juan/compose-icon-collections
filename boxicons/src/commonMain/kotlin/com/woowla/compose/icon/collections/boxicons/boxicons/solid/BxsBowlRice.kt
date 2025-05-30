package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBowlRice: ImageVector
    get() {
        if (_bxsBowlRice != null) {
            return _bxsBowlRice!!
        }
        _bxsBowlRice = Builder(name = "BxsBowlRice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -1.8f, -3.0f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, false, -3.63f, -3.13f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -1.0f, 0.13f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -5.11f, 0.0f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -1.0f, -0.13f)
                arcTo(3.66f, 3.66f, 0.0f, false, false, 4.81f, 7.0f)
                arcTo(3.58f, 3.58f, 0.0f, false, false, 3.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 5.0f, 8.66f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.34f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(5.0f, 10.0f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 1.11f, -1.39f)
                lineToRelative(0.83f, -0.26f)
                lineToRelative(-0.16f, -0.85f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, true, 1.66f, -1.62f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, 0.83f, 0.2f)
                lineToRelative(0.81f, 0.45f)
                lineToRelative(0.5f, -0.77f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, true, 2.84f, 0.0f)
                lineToRelative(0.5f, 0.77f)
                lineToRelative(0.81f, -0.45f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, 0.83f, -0.2f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, 1.67f, 1.6f)
                lineToRelative(-0.16f, 0.85f)
                lineToRelative(0.82f, 0.28f)
                arcTo(1.59f, 1.59f, 0.0f, false, true, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _bxsBowlRice!!
    }

private var _bxsBowlRice: ImageVector? = null
