package com.woowla.compose.icon.collections.devicons.devicons.vertx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VertxGroup

public val VertxGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF782a91)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.88f, 0.0f)
                arcTo(16.84f, 16.84f, 0.0f, false, false, 0.0f, 16.88f)
                verticalLineToRelative(9.43f)
                horizontalLineToRelative(17.31f)
                lineToRelative(19.44f, 44.15f)
                lineToRelative(20.15f, -44.09f)
                lineToRelative(-0.04f, -0.06f)
                horizontalLineToRelative(23.44f)
                lineToRelative(14.57f, 21.24f)
                lineToRelative(14.53f, -21.24f)
                lineTo(128.0f, 26.31f)
                verticalLineToRelative(-9.43f)
                arcTo(16.84f, 16.84f, 0.0f, false, false, 111.12f, 0.0f)
                lineTo(16.88f, 0.0f)
                close()
                moveTo(0.0f, 32.34f)
                verticalLineToRelative(78.78f)
                arcTo(16.84f, 16.84f, 0.0f, false, false, 16.88f, 128.0f)
                horizontalLineToRelative(94.25f)
                arcTo(16.84f, 16.84f, 0.0f, false, false, 128.0f, 111.12f)
                verticalLineToRelative(-10.36f)
                horizontalLineToRelative(-20.7f)
                lineToRelative(-8.46f, -12.55f)
                lineToRelative(10.95f, -15.71f)
                lineToRelative(18.01f, 25.31f)
                lineTo(128.0f, 97.82f)
                lineTo(128.0f, 33.52f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-24.49f, 34.58f)
                lineToRelative(-9.24f, 13.04f)
                lineToRelative(-13.89f, 19.62f)
                horizontalLineToRelative(-7.79f)
                arcToRelative(17.28f, 17.28f, 0.0f, false, false, -6.13f, -12.81f)
                lineToRelative(17.19f, -24.27f)
                lineToRelative(-15.18f, -21.34f)
                lineToRelative(-19.57f, 42.81f)
                arcToRelative(17.28f, 17.28f, 0.0f, false, false, -10.87f, 16.0f)
                lineToRelative(0.02f, 0.18f)
                horizontalLineToRelative(-7.47f)
                lineToRelative(-3.81f, -8.64f)
                lineTo(0.0f, 32.34f)
                close()
                moveTo(55.12f, 90.38f)
                curveToRelative(5.96f, 0.0f, 10.78f, 4.83f, 10.78f, 10.78f)
                curveToRelative(0.0f, 5.96f, -4.83f, 10.78f, -10.78f, 10.78f)
                reflectiveCurveTo(44.33f, 107.12f, 44.33f, 101.16f)
                curveToRelative(0.0f, -5.96f, 4.83f, -10.78f, 10.79f, -10.78f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
