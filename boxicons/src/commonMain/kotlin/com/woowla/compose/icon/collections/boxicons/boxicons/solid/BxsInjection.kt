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

public val SolidGroup.BxsInjection: ImageVector
    get() {
        if (_bxsInjection != null) {
            return _bxsInjection!!
        }
        _bxsInjection = Builder(name = "BxsInjection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.61f)
                lineTo(9.24f, 8.35f)
                lineToRelative(3.31f, 3.31f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-3.31f, -3.31f)
                lineToRelative(-1.77f, 1.77f)
                lineToRelative(3.31f, 3.31f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-3.31f, -3.31f)
                lineToRelative(-2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 16.66f)
                lineToRelative(1.0f, 1.89f)
                lineToRelative(-2.25f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(5.45f, 20.0f)
                lineToRelative(1.89f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, 0.26f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.42f, -0.59f)
                lineTo(18.39f, 12.0f)
                close()
                moveTo(19.8f, 9.2f)
                lineTo(18.01f, 7.4f)
                lineTo(19.43f, 5.99f)
                lineTo(20.84f, 7.4f)
                lineTo(22.25f, 5.99f)
                lineTo(18.01f, 1.75f)
                lineTo(16.6f, 3.16f)
                lineTo(18.01f, 4.58f)
                lineTo(16.6f, 5.99f)
                lineTo(14.8f, 4.2f)
                lineTo(13.06f, 2.45f)
                lineTo(11.65f, 3.87f)
                lineTo(12.68f, 4.9f)
                verticalLineToRelative(0.01f)
                lineToRelative(6.41f, 6.41f)
                horizontalLineToRelative(0.01f)
                lineToRelative(1.03f, 1.03f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(-1.74f, -1.74f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }
        .build()
        return _bxsInjection!!
    }

private var _bxsInjection: ImageVector? = null
