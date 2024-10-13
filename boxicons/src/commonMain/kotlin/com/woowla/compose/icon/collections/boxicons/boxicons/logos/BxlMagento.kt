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

public val LogosGroup.BxlMagento: ImageVector
    get() {
        if (_bxlMagento != null) {
            return _bxlMagento!!
        }
        _bxlMagento = Builder(name = "BxlMagento", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 22.019f)
                lineToRelative(-3.717f, -2.146f)
                lineTo(8.283f, 9.863f)
                lineToRelative(2.479f, -1.43f)
                verticalLineToRelative(10.01f)
                lineToRelative(1.238f, 0.753f)
                lineToRelative(1.238f, -0.753f)
                lineTo(13.238f, 8.434f)
                lineToRelative(2.479f, 1.43f)
                verticalLineToRelative(10.01f)
                lineTo(12.0f, 22.019f)
                close()
                moveTo(20.666f, 7.005f)
                verticalLineToRelative(10.009f)
                lineToRelative(-2.475f, 1.43f)
                lineTo(18.191f, 8.434f)
                lineTo(12.0f, 4.861f)
                lineTo(5.807f, 8.434f)
                verticalLineToRelative(10.01f)
                lineToRelative(-2.473f, -1.43f)
                lineTo(3.334f, 7.005f)
                lineTo(12.0f, 2.0f)
                lineToRelative(8.666f, 5.005f)
                close()
            }
        }
        .build()
        return _bxlMagento!!
    }

private var _bxlMagento: ImageVector? = null
