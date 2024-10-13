package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlAdobe: ImageVector
    get() {
        if (_bxlAdobe != null) {
            return _bxlAdobe!!
        }
        _bxlAdobe = Builder(name = "BxlAdobe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.966f)
                verticalLineTo(4.034f)
                horizontalLineToRelative(-6.654f)
                close()
                moveTo(3.0f, 4.034f)
                verticalLineToRelative(15.932f)
                lineTo(9.658f, 4.034f)
                close()
                moveTo(9.092f, 16.76f)
                horizontalLineToRelative(3.104f)
                lineToRelative(1.268f, 3.205f)
                horizontalLineToRelative(2.778f)
                lineTo(12.003f, 9.904f)
                close()
            }
        }
        .build()
        return _bxlAdobe!!
    }

private var _bxlAdobe: ImageVector? = null
