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

public val SolidGroup.BxsCoffeeTogo: ImageVector
    get() {
        if (_bxsCoffeeTogo != null) {
            return _bxsCoffeeTogo!!
        }
        _bxsCoffeeTogo = Builder(name = "BxsCoffeeTogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 5.0f)
                lineToRelative(-1.224f, -2.447f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.382f, 2.0f)
                horizontalLineTo(7.618f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.894f, 0.553f)
                lineTo(5.5f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(6.734f, 21.142f)
                curveToRelative(0.071f, 0.492f, 0.493f, 0.858f, 0.991f, 0.858f)
                horizontalLineToRelative(8.551f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.99f, -0.858f)
                lineTo(19.0f, 9.0f)
                horizontalLineTo(5.0f)
                lineToRelative(1.734f, 12.142f)
                close()
                moveTo(16.0f, 12.0f)
                lineToRelative(-0.714f, 5.0f)
                horizontalLineTo(8.714f)
                lineTo(8.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _bxsCoffeeTogo!!
    }

private var _bxsCoffeeTogo: ImageVector? = null
