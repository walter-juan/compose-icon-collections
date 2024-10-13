package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCoffeeTogo: ImageVector
    get() {
        if (_bxCoffeeTogo != null) {
            return _bxCoffeeTogo!!
        }
        _bxCoffeeTogo = Builder(name = "BxCoffeeTogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.99f, -0.858f)
                lineTo(19.867f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(-1.382f)
                lineToRelative(-1.724f, -3.447f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-0.379f, 0.0f, -0.725f, 0.214f, -0.895f, 0.553f)
                lineTo(4.382f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.133f)
                lineTo(6.01f, 21.142f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 22.0f)
                close()
                moveTo(17.418f, 11.0f)
                lineTo(6.582f, 11.0f)
                lineToRelative(-0.429f, -3.0f)
                horizontalLineToRelative(11.693f)
                lineToRelative(-0.428f, 3.0f)
                close()
                moveTo(7.867f, 20.0f)
                lineTo(7.438f, 17.0f)
                horizontalLineToRelative(9.123f)
                lineToRelative(-0.429f, 3.0f)
                lineTo(7.867f, 20.0f)
                close()
                moveTo(7.618f, 4.0f)
                horizontalLineToRelative(8.764f)
                lineToRelative(1.0f, 2.0f)
                lineTo(6.618f, 6.0f)
                lineToRelative(1.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxCoffeeTogo!!
    }

private var _bxCoffeeTogo: ImageVector? = null
