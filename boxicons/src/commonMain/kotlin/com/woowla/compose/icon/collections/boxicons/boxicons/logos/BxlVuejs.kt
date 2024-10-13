package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlVuejs: ImageVector
    get() {
        if (_bxlVuejs != null) {
            return _bxlVuejs!!
        }
        _bxlVuejs = Builder(name = "BxlVuejs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.765f)
                lineToRelative(5.592f, -9.437f)
                horizontalLineToRelative(-3.276f)
                lineTo(12.0f, 7.33f)
                verticalLineToRelative(0.002f)
                lineTo(9.688f, 3.328f)
                horizontalLineToRelative(-3.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.461f, 3.332f)
                lineTo(12.0f, 14.235f)
                lineTo(5.539f, 3.332f)
                horizontalLineTo(1.992f)
                lineTo(12.0f, 20.672f)
                lineToRelative(10.008f, -17.34f)
                close()
            }
        }
        .build()
        return _bxlVuejs!!
    }

private var _bxlVuejs: ImageVector? = null
