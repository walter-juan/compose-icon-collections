package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Unlock2Fill: ImageVector
    get() {
        if (_unlock2Fill != null) {
            return _unlock2Fill!!
        }
        _unlock2Fill = Builder(name = "Unlock2Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 0.0f)
                curveToRelative(1.07f, 0.0f, 2.041f, 0.42f, 2.759f, 1.104f)
                lineToRelative(0.14f, 0.14f)
                lineToRelative(0.062f, 0.08f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.71f, 0.675f)
                lineToRelative(-0.076f, -0.066f)
                lineToRelative(-0.216f, -0.205f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 8.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 13.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, -2.45f)
                verticalLineTo(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
            }
        }
        .build()
        return _unlock2Fill!!
    }

private var _unlock2Fill: ImageVector? = null
