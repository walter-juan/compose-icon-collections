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

public val LogosGroup.BxlMastodon: ImageVector
    get() {
        if (_bxlMastodon != null) {
            return _bxlMastodon!!
        }
        _bxlMastodon = Builder(name = "BxlMastodon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 17.24f)
                curveToRelative(2.5f, -0.3f, 4.69f, -1.84f, 5.0f, -3.25f)
                arcToRelative(33.59f, 33.59f, 0.0f, false, false, 0.4f, -5.42f)
                curveTo(21.33f, 4.23f, 18.48f, 3.0f, 18.48f, 3.0f)
                arcTo(17.64f, 17.64f, 0.0f, false, false, 12.0f, 2.0f)
                arcToRelative(17.64f, 17.64f, 0.0f, false, false, -6.48f, 1.0f)
                reflectiveCurveTo(2.68f, 4.23f, 2.68f, 8.57f)
                verticalLineToRelative(3.44f)
                curveToRelative(0.1f, 4.24f, 0.78f, 8.42f, 4.7f, 9.46f)
                arcTo(14.73f, 14.73f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(9.21f, 9.21f, 0.0f, false, false, 3.54f, -0.81f)
                lineToRelative(-0.07f, -1.64f)
                arcTo(11.41f, 11.41f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-1.8f, -0.06f, -3.71f, -0.19f, -4.0f, -2.4f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, true, 0.0f, -0.63f)
                arcToRelative(22.68f, 22.68f, 0.0f, false, false, 4.0f, 0.54f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, false, 4.0f, -0.27f)
                close()
                moveTo(9.46f, 7.44f)
                quadToRelative(-1.35f, 0.0f, -1.35f, 1.62f)
                verticalLineToRelative(5.1f)
                lineTo(6.0f, 14.16f)
                lineTo(6.0f, 8.9f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, 0.82f, -2.56f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, 2.23f, -1.0f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, 2.4f, 1.23f)
                lineToRelative(0.52f, 0.87f)
                lineToRelative(0.52f, -0.87f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, 2.4f, -1.23f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, 2.23f, 1.0f)
                arcTo(3.78f, 3.78f, 0.0f, false, true, 18.0f, 8.9f)
                verticalLineToRelative(5.26f)
                horizontalLineToRelative(-2.11f)
                verticalLineToRelative(-5.1f)
                quadToRelative(0.0f, -1.62f, -1.35f, -1.62f)
                curveToRelative(-1.0f, 0.0f, -1.51f, 0.64f, -1.51f, 1.92f)
                verticalLineToRelative(2.79f)
                lineTo(11.0f, 12.15f)
                lineTo(11.0f, 9.36f)
                curveToRelative(0.0f, -1.28f, -0.54f, -1.92f, -1.54f, -1.92f)
                close()
            }
        }
        .build()
        return _bxlMastodon!!
    }

private var _bxlMastodon: ImageVector? = null
