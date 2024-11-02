package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Googlegemini: ImageVector
    get() {
        if (_googlegemini != null) {
            return _googlegemini!!
        }
        _googlegemini = Builder(name = "Googlegemini", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.04f, 19.32f)
                quadTo(12.0f, 21.51f, 12.0f, 24.0f)
                quadToRelative(0.0f, -2.49f, 0.93f, -4.68f)
                quadToRelative(0.96f, -2.19f, 2.58f, -3.81f)
                reflectiveQuadToRelative(3.81f, -2.55f)
                quadTo(21.51f, 12.0f, 24.0f, 12.0f)
                quadToRelative(-2.49f, 0.0f, -4.68f, -0.93f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -3.81f, -2.58f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -2.58f, -3.81f)
                quadTo(12.0f, 2.49f, 12.0f, 0.0f)
                quadToRelative(0.0f, 2.49f, -0.96f, 4.68f)
                quadToRelative(-0.93f, 2.19f, -2.55f, 3.81f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -3.81f, 2.58f)
                quadTo(2.49f, 12.0f, 0.0f, 12.0f)
                quadToRelative(2.49f, 0.0f, 4.68f, 0.96f)
                quadToRelative(2.19f, 0.93f, 3.81f, 2.55f)
                reflectiveQuadToRelative(2.55f, 3.81f)
            }
        }
        .build()
        return _googlegemini!!
    }

private var _googlegemini: ImageVector? = null
