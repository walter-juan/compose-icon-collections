package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.MicrosoftTeams: ImageVector
    get() {
        if (_microsoftTeams != null) {
            return _microsoftTeams!!
        }
        _microsoftTeams = Builder(name = "MicrosoftTeams", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.186f, 4.797f)
                arcToRelative(2.42f, 2.42f, 0.0f, true, false, -2.86f, -2.448f)
                horizontalLineToRelative(1.178f)
                curveToRelative(0.929f, 0.0f, 1.682f, 0.753f, 1.682f, 1.682f)
                close()
                moveTo(4.891f, 12.535f)
                horizontalLineToRelative(2.613f)
                curveToRelative(0.929f, 0.0f, 1.682f, -0.753f, 1.682f, -1.682f)
                lineTo(9.186f, 5.58f)
                horizontalLineToRelative(2.783f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.682f, 0.716f)
                verticalLineToRelative(4.294f)
                arcToRelative(4.197f, 4.197f, 0.0f, false, true, -4.093f, 4.293f)
                curveToRelative(-1.618f, -0.04f, -3.0f, -0.99f, -3.667f, -2.35f)
                close()
                moveTo(15.628f, 3.163f)
                arcToRelative(1.674f, 1.674f, 0.0f, true, true, -3.349f, 0.0f)
                arcToRelative(1.674f, 1.674f, 0.0f, false, true, 3.349f, 0.0f)
                moveToRelative(-2.238f, 9.488f)
                lineToRelative(-0.12f, -0.002f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 0.381f, -2.07f)
                lineTo(13.651f, 6.306f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.15f, -0.725f)
                horizontalLineToRelative(1.792f)
                curveToRelative(0.39f, 0.0f, 0.707f, 0.317f, 0.707f, 0.707f)
                verticalLineToRelative(3.765f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -2.598f, 2.598f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.682f, 3.349f)
                horizontalLineToRelative(6.822f)
                curveToRelative(0.377f, 0.0f, 0.682f, 0.305f, 0.682f, 0.682f)
                verticalLineToRelative(6.822f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, -0.682f, 0.682f)
                lineTo(0.682f, 11.535f)
                arcTo(0.68f, 0.68f, 0.0f, false, true, 0.0f, 10.853f)
                lineTo(0.0f, 4.03f)
                curveToRelative(0.0f, -0.377f, 0.305f, -0.682f, 0.682f, -0.682f)
                close()
                moveTo(5.888f, 5.945f)
                verticalLineToRelative(-0.72f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(0.72f)
                horizontalLineToRelative(1.357f)
                lineTo(3.655f, 9.66f)
                horizontalLineToRelative(0.87f)
                lineTo(4.525f, 5.945f)
                close()
            }
        }
        .build()
        return _microsoftTeams!!
    }

private var _microsoftTeams: ImageVector? = null
