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

public val Simpleicons.Bentobox: ImageVector
    get() {
        if (_bentobox != null) {
            return _bentobox!!
        }
        _bentobox = Builder(name = "Bentobox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.406f, 3.821f)
                lineToRelative(2.723f, -2.725f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 5.29f, 0.0f)
                lineToRelative(0.078f, 0.078f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 0.0f, 5.29f)
                lineToRelative(-2.723f, 2.723f)
                lineToRelative(-5.368f, -5.366f)
                close()
                moveTo(14.813f, 11.228f)
                lineTo(17.536f, 8.505f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 5.29f, 0.0f)
                lineToRelative(0.078f, 0.078f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 0.0f, 5.29f)
                lineToRelative(-2.725f, 2.723f)
                lineToRelative(-5.369f, -5.368f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(0.0f, 11.228f)
                lineToRelative(2.723f, -2.723f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 5.29f, 0.0f)
                lineToRelative(0.079f, 0.078f)
                arcToRelative(3.742f, 3.742f, 0.0f, false, true, 0.0f, 5.29f)
                lineToRelative(-2.724f, 2.723f)
                lineTo(0.0f, 11.228f)
                close()
                moveTo(7.406f, 18.634f)
                lineTo(10.129f, 15.911f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 5.29f, 0.0f)
                lineToRelative(0.078f, 0.078f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 0.0f, 5.29f)
                lineTo(12.774f, 24.0f)
                lineToRelative(-5.368f, -5.366f)
                close()
            }
        }
        .build()
        return _bentobox!!
    }

private var _bentobox: ImageVector? = null
