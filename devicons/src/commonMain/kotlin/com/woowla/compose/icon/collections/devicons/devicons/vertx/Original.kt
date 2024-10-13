package com.woowla.compose.icon.collections.devicons.devicons.vertx

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
import com.woowla.compose.icon.collections.devicons.devicons.VertxGroup

public val VertxGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF782a91)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.88f, 0.0f)
                horizontalLineToRelative(94.24f)
                arcTo(16.84f, 16.84f, 0.0f, false, true, 128.0f, 16.88f)
                verticalLineToRelative(94.24f)
                arcTo(16.84f, 16.84f, 0.0f, false, true, 111.12f, 128.0f)
                horizontalLineTo(16.88f)
                arcTo(16.84f, 16.84f, 0.0f, false, true, 0.0f, 111.12f)
                verticalLineTo(16.88f)
                arcTo(16.84f, 16.84f, 0.0f, false, true, 16.88f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 26.31f)
                verticalLineToRelative(6.03f)
                lineToRelative(26.58f, 60.37f)
                lineToRelative(3.8f, 8.64f)
                horizontalLineToRelative(7.47f)
                arcToRelative(18.19f, 18.19f, 0.0f, false, true, -0.01f, -0.18f)
                arcTo(17.28f, 17.28f, 0.0f, false, true, 48.7f, 85.16f)
                lineToRelative(19.56f, -42.81f)
                lineTo(83.45f, 63.68f)
                lineToRelative(-17.19f, 24.28f)
                arcToRelative(17.28f, 17.28f, 0.0f, false, true, 6.13f, 12.81f)
                horizontalLineToRelative(7.79f)
                lineToRelative(13.9f, -19.62f)
                lineToRelative(9.23f, -13.04f)
                lineTo(127.8f, 33.52f)
                verticalLineToRelative(-7.21f)
                horizontalLineToRelative(-18.39f)
                lineTo(94.87f, 47.55f)
                lineTo(80.29f, 26.31f)
                lineTo(56.85f, 26.31f)
                lineToRelative(0.04f, 0.06f)
                lineTo(36.74f, 70.46f)
                lineToRelative(-19.44f, -44.15f)
                close()
                moveTo(109.79f, 72.51f)
                lineTo(98.84f, 88.21f)
                lineToRelative(8.46f, 12.55f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-2.95f)
                close()
                moveTo(55.12f, 90.38f)
                curveToRelative(-5.96f, 0.0f, -10.78f, 4.83f, -10.78f, 10.78f)
                curveToRelative(0.0f, 5.96f, 4.83f, 10.79f, 10.78f, 10.79f)
                curveToRelative(5.96f, 0.0f, 10.78f, -4.83f, 10.78f, -10.79f)
                curveToRelative(0.0f, -5.96f, -4.83f, -10.78f, -10.78f, -10.78f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
