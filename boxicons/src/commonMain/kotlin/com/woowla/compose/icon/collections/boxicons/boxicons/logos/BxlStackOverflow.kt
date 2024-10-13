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

public val LogosGroup.BxlStackOverflow: ImageVector
    get() {
        if (_bxlStackOverflow != null) {
            return _bxlStackOverflow!!
        }
        _bxlStackOverflow = Builder(name = "BxlStackOverflow", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.24f, 19.399f)
                verticalLineToRelative(-4.804f)
                horizontalLineToRelative(1.6f)
                lineTo(18.84f, 21.0f)
                lineTo(4.381f, 21.0f)
                verticalLineToRelative(-6.405f)
                horizontalLineToRelative(1.598f)
                verticalLineToRelative(4.804f)
                lineTo(17.24f, 19.399f)
                close()
                moveTo(7.582f, 17.8f)
                horizontalLineToRelative(8.055f)
                verticalLineToRelative(-1.604f)
                lineTo(7.582f, 16.196f)
                lineTo(7.582f, 17.8f)
                close()
                moveTo(7.777f, 14.16f)
                lineTo(15.636f, 15.801f)
                lineTo(15.976f, 14.249f)
                lineTo(8.115f, 12.607f)
                lineTo(7.777f, 14.16f)
                close()
                moveTo(8.795f, 10.366f)
                lineTo(16.076f, 13.764f)
                lineTo(16.754f, 12.301f)
                lineTo(9.473f, 8.902f)
                lineTo(8.795f, 10.356f)
                verticalLineToRelative(0.01f)
                close()
                moveTo(10.832f, 6.777f)
                lineTo(16.998f, 11.919f)
                lineTo(18.016f, 10.703f)
                lineTo(11.854f, 5.563f)
                lineTo(10.838f, 6.776f)
                lineTo(10.832f, 6.777f)
                close()
                moveTo(14.814f, 2.999f)
                lineTo(13.503f, 3.968f)
                lineTo(18.306f, 10.422f)
                lineTo(19.619f, 9.451f)
                lineTo(14.812f, 2.999f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _bxlStackOverflow!!
    }

private var _bxlStackOverflow: ImageVector? = null
