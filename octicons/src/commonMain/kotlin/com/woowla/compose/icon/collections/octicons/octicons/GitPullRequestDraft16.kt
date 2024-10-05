package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.GitPullRequestDraft16: ImageVector
    get() {
        if (_gitPullRequestDraft16 != null) {
            return _gitPullRequestDraft16!!
        }
        _gitPullRequestDraft16 = Builder(name = "GitPullRequestDraft16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.25f, 1.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 4.0f, 5.372f)
                verticalLineToRelative(5.256f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(2.5f, 5.372f)
                arcTo(2.251f, 2.251f, 0.0f, false, true, 3.25f, 1.0f)
                close()
                moveTo(12.75f, 15.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                close()
                moveTo(2.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
                moveTo(3.25f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(12.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(14.0f, 7.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(14.0f, 3.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
            }
        }
        .build()
        return _gitPullRequestDraft16!!
    }

private var _gitPullRequestDraft16: ImageVector? = null