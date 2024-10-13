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

public val LogosGroup.BxlFacebookSquare: ImageVector
    get() {
        if (_bxlFacebookSquare != null) {
            return _bxlFacebookSquare!!
        }
        _bxlFacebookSquare = Builder(name = "BxlFacebookSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.615f)
                verticalLineToRelative(-6.96f)
                horizontalLineToRelative(-2.338f)
                verticalLineToRelative(-2.725f)
                horizontalLineToRelative(2.338f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.325f, 1.42f, -3.592f, 3.5f, -3.592f)
                curveToRelative(0.699f, -0.002f, 1.399f, 0.034f, 2.095f, 0.107f)
                verticalLineToRelative(2.42f)
                horizontalLineToRelative(-1.435f)
                curveToRelative(-1.128f, 0.0f, -1.348f, 0.538f, -1.348f, 1.325f)
                verticalLineToRelative(1.735f)
                horizontalLineToRelative(2.697f)
                lineToRelative(-0.35f, 2.725f)
                horizontalLineToRelative(-2.348f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bxlFacebookSquare!!
    }

private var _bxlFacebookSquare: ImageVector? = null
