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

public val LogosGroup.BxlSteam: ImageVector
    get() {
        if (_bxlSteam != null) {
            return _bxlSteam!!
        }
        _bxlSteam = Builder(name = "BxlSteam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.21f, 17.32f)
                lineTo(7.0f, 16.8f)
                arcToRelative(2.13f, 2.13f, 0.0f, true, false, 1.17f, -2.93f)
                lineToRelative(1.28f, 0.53f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, true, -1.22f, 2.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, 9.34f)
                lineToRelative(5.38f, 2.21f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, true, 0.47f, -0.24f)
                arcTo(2.62f, 2.62f, 0.0f, false, true, 9.0f, 13.1f)
                lineToRelative(2.44f, -3.56f)
                arcToRelative(3.8f, 3.8f, 0.0f, true, true, 3.8f, 3.8f)
                horizontalLineToRelative(-0.08f)
                lineToRelative(-3.51f, 2.5f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, true, -5.47f, 0.68f)
                lineToRelative(-3.77f, -1.6f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.79f, 9.5f)
                arcToRelative(2.53f, 2.53f, 0.0f, true, false, -2.53f, 2.5f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, 2.53f, -2.5f)
                close()
                moveTo(13.37f, 9.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, true, true, 1.9f, 1.91f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.9f, -1.92f)
                close()
            }
        }
        .build()
        return _bxlSteam!!
    }

private var _bxlSteam: ImageVector? = null
