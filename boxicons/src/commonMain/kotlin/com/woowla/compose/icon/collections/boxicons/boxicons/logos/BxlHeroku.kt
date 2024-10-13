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

public val LogosGroup.BxlHeroku: ImageVector
    get() {
        if (_bxlHeroku != null) {
            return _bxlHeroku!!
        }
        _bxlHeroku = Builder(name = "BxlHeroku", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.17f, 2.0f)
                horizontalLineTo(4.83f)
                arcTo(1.79f, 1.79f, 0.0f, false, false, 3.0f, 3.8f)
                verticalLineToRelative(16.4f)
                arcTo(1.79f, 1.79f, 0.0f, false, false, 4.83f, 22.0f)
                horizontalLineToRelative(14.34f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 21.0f, 20.2f)
                verticalLineTo(3.8f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 19.17f, 2.0f)
                close()
                moveTo(20.0f, 20.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.81f, 0.8f)
                horizontalLineTo(4.83f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, -0.8f, -0.8f)
                verticalLineTo(3.8f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, 0.8f, -0.8f)
                horizontalLineToRelative(14.34f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.81f, 0.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.53f, 19.0f)
                lineToRelative(2.25f, -2.0f)
                lineToRelative(-2.25f, -2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(13.22f, 10.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.75f, 0.7f)
                lineTo(9.47f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.65f)
                lineTo(8.88f, 13.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 4.29f, -1.0f)
                curveToRelative(1.0f, 0.0f, 1.25f, 0.55f, 1.25f, 1.05f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.42f, 13.0f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, false, -0.8f, -2.1f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, false, -2.4f, -0.9f)
                close()
                moveTo(13.0f, 8.25f)
                horizontalLineToRelative(2.0f)
                arcTo(5.89f, 5.89f, 0.0f, false, false, 16.47f, 5.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(7.17f, 7.17f, 0.0f, false, true, 13.0f, 8.25f)
                close()
            }
        }
        .build()
        return _bxlHeroku!!
    }

private var _bxlHeroku: ImageVector? = null
